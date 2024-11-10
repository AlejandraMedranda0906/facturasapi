package com.example.facturasapi.repository

import com.example.facturasapi.model.usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UsuarioRepository:JpaRepository<usuario, Long> {

}