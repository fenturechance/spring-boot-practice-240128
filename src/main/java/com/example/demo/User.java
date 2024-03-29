package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data //自動生成getter setter
@NoArgsConstructor // 自動生成無參數constructor
@AllArgsConstructor // 自動生成全參數constructor
public class User {
    private Long id;
    private String name;
}
