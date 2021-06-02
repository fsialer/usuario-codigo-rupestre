package com.codigorupestre.spacenative.usuarios.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codigorupestre.spacenative.usuarios.model.Usuario;
import com.codigorupestre.spacenative.usuarios.repository.UsuarioRepository;

/*
 * 	SERVICIO 1 - CREAR UN USUARIO NUEVO
 *	SERVICIO 2 - BUSCAR USUARIO EXISTENTE
 *	SERVICIO 3 -ACTUALIZAR USUARIO
 *	SERVICIO 4 - ELIMINAR USUARIO
 *	SERVICIO 5 - INACTIVAR USUARIO
 *	SERVICIO 6 LISTAR TODOS LOS USUARIOS
 *	SERVICIO 7 - CAMBIAR CONTRASEÑA
 *	SERVICIO 8 - ENVIE POR CORREO EL CAMBIO DE CONTRASEÑA
 *	SERVICIO 9 - RECUPERAR CONTRASEÑA. ENVIAR POR CORREO
 *	
 *	ROLES  Y SERVICIOS DE USUARIO - ADMIN - USUARIO
 *	VERIFICAR CADUCIDAD DE CONTRASEÑA. [JWT TOKEN]
 *	CONFIRMAR CONTRASEÑA
 *	TIEMPO DE INACTIVIDAD DE SESIONES
 *
 * */

@RestController
@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api/v1/usuario")
public class UsuarioAPI {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@GetMapping
	public List<Usuario> obtenerUsuarios(){
		return usuarioRepository.findAll();
	}
}
