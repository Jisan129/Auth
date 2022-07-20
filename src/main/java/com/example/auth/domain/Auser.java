package com.example.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.AUTO;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Auser {
    @Id @GeneratedValue(strategy=AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    @ManyToMany(fetch = EAGER)
    private Collection<Role> roles=new ArrayList<>();
}
