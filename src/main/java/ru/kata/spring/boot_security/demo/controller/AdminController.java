package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.ArrayList;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final UserService userService;

    private final RoleService roleService;

    @Autowired
    public AdminController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("")
    public String getAllUsers(Model model) {
        model.addAttribute("alluser", userService.getAll());
        return "admin";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return "redirect:/admin";
    }

    @GetMapping ("/edit/{id}")
    public String editUser(@PathVariable("id") long id, Model model) {
        model.addAttribute("edit", userService.getById(id));
        return "edit-user";
    }

    @PatchMapping("/edit")
    public String edit(@ModelAttribute("edit") User user, @RequestParam("listRoles") ArrayList<Long> roles) {
        user.setRoles(roleService.findByIdRoles(roles));
        userService.updateUser(user);
        return "redirect:/admin";
    }

    @GetMapping("/new")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("adduser",user);
        return "new-user";
    }

    @PostMapping("/new")
    public String addNewUser(@ModelAttribute("adduser") User user, @RequestParam("listRoles") ArrayList<Long> roles){
        user.setRoles(roleService.findByIdRoles(roles));
        userService.saveUser(user);
        return "redirect:/admin";
    }
}
