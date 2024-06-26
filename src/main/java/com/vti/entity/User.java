package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;

@Getter
@Setter

public class User {
      private int id;
      private String fullName;
      private String email;
      private String password;
      private Role role;
      private String proSkill;
      private int expInYear;

      public int getId() {
            return id;
      }

      public void setId(int id) {
            this.id = id;
      }

      public String getFullName() {
            return fullName;
      }

      public void setFullName(String fullName) {
            this.fullName = fullName;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getPassword() {
            return password;
      }

      public void setPassword(String password) {
            this.password = password;
      }

      public Role getRole() {
            return role;
      }

      public void setRole(String role) {
            this.role = Role.valueOf(role);
      }

      public String getProSkill() {
            return proSkill;
      }

      public void setProSkill(String proSkill) {
            this.proSkill = proSkill;
      }

      public int getExpInYear() {
            return expInYear;
      }

      public void setExpInYear(int expInYear) {
            this.expInYear = expInYear;
      }

      public enum Role{
          ADMIN, EMPLOYEE
      }
}
