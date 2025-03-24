package com.contactManager.contactManager.service;


import com.contactManager.contactManager.model.ContactModel;
import com.contactManager.contactManager.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    private ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public List<ContactModel> findAll() {
        return repository.findAll();
    }

    public Optional<ContactModel> findAllById(Long id) {
        return repository.findById(id);
    }

    public ContactModel save(ContactModel contact) {
        return repository.save(contact);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }




}
