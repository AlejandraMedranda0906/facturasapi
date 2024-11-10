package com.example.facturasapi.service

import com.example.facturasapi.model.usuario
import com.example.facturasapi.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsuarioService {

    @Autowired
    lateinit var  usuarioRepository: UsuarioRepository

    fun list (): List<usuario>{
        return usuarioRepository.findAll()
    }
//number:Long
    fun save(usuario:usuario): usuario{
        return usuarioRepository.save(usuario)
    }
}