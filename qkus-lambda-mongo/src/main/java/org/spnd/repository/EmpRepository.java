package org.spnd.repository;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmpRepository {
    public String findUser() {
        return "Sups & Amrita";
    }
}
