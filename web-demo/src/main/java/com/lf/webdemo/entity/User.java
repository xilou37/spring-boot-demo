package com.lf.webdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @Author lf
 * @Create 2023/3/1 0001 12:04
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
