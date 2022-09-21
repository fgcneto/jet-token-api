package centrallogique.api;

import centrallogique.api.enuns.Papel;
import centrallogique.api.model.Usuario;
import centrallogique.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class CentralLogiqueApplication {

	@Autowired
	private UsuarioRepository repository;

//	@PostConstruct
//	public void initUsers() {
//
//		List<Usuario> users = Stream.of(
//				new Usuario("Manoel","manoel@gmail.com", "super", encoder().encode("admin"), Papel.SUPER),
//				new Usuario("João","joao@gmail.com", "user", encoder().encode("user1"), Papel.USUARIO),
//				new Usuario("Maria","maria@gmail.com", "admin", encoder().encode("user2"), Papel.ADMINISTRADOR)
//		).collect(Collectors.toList());
//
//		repository.saveAll(users);
//
//	}
//
//	public PasswordEncoder encoder() {
//		return new BCryptPasswordEncoder();
//	}

	public static void main(String[] args) {
		SpringApplication.run(CentralLogiqueApplication.class, args);
	}

}
