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
      private int projectId;




      public void setRole(String role) {
            this.role = Role.valueOf(role);
      }

      public enum Role{
          EMPLOYEE, MANAGER
      }
}
