package com.contactManager.contactManager.controller;


import com.contactManager.contactManager.model.ContactModel;
import com.contactManager.contactManager.service.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactModel> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactModel> searchForId(@PathVariable Long id) {
        Optional<ContactModel> contact = service.findAllById(id);
        return contact.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ContactModel save(@RequestBody ContactModel contact) {
        return service.save(contact);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.findAllById(id).isPresent()) {
            service.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
