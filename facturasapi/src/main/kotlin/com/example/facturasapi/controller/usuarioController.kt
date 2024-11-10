package com.example.facturasapi.controller

import com.example.facturasapi.model.usuario
import com.example.facturasapi.service.UsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/usuario")
class usuarioController {

    @Autowired
    lateinit var usuarioService: UsuarioService

    @GetMapping
    fun List():List<usuario>{

        return usuarioService.list()
    }

    @PostMapping
    fun save(@RequestBody usuario:usuario):usuario{
        return usuarioService.save(usuario)
    }
}