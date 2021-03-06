package pl.myblog.springblog.model;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String phone;
    @Type(type = "text")
    private String message;

    private LocalDateTime date_added = LocalDateTime.now();

}
