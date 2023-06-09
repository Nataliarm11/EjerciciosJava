package com.mindhub.EjemploClases;

import com.mindhub.EjemploClases.models.Frase;
import com.mindhub.EjemploClases.models.Mentor;
import com.mindhub.EjemploClases.models.Modulo;
import com.mindhub.EjemploClases.repositories.FraseRepository;
import com.mindhub.EjemploClases.repositories.MentorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@SpringBootApplication
public class EjemploClasesApplication {

	public static void main(String[] args) {

		SpringApplication.run(EjemploClasesApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(MentorRepository mentorRepository, FraseRepository fraseRepository){
		return args -> {

			Mentor mentor2 = new Mentor("Guillermo","Cornetti", Modulo.JAVA, (byte) 33, 1.88f);
			Mentor mentor1 = new Mentor("Facundo","Araujo", Modulo.JAVA, (byte) 18, 1.82f);
			Mentor mentor3 = new Mentor("Martin","Araolaza", Modulo.JAVA, (byte) 33, 1.88f);
			Mentor mentor4 = new Mentor("Sebastian","Alfonso", Modulo.JAVA, (byte) 18, 1.82f);
			Mentor mentor5 = new Mentor("Nico","Cirulli", Modulo.JS, (byte) 33, 1.88f);
			Mentor mentor6 = new Mentor("Lucre","Gillone", Modulo.JS, (byte) 18, 1.82f);

			mentorRepository.save(mentor1);
			mentorRepository.save(mentor2);
			mentorRepository.save(mentor3);
			mentorRepository.save(mentor4);
			mentorRepository.save(mentor5);
			mentorRepository.save(mentor6);

			Frase frase1 = new Frase("Frase-001", "Recurrente", "Practicamente");
			Frase frase2 = new Frase("Frase-002", "Recurrente", "Rimbombante");
			Frase frase3 = new Frase("Frase-003", "Recurrente", "Tuki Tuki");
			Frase frase4 = new Frase("Frase-004", "Recurrente", "Amazing");
			Frase frase5 = new Frase("Frase-005", "Recurrente", "No lo tienen que adivinar lo tienen que leer");
			Frase frase6 = new Frase("Frase-006", "Recurrente", "Como el padre nuestro");
			Frase frase7 = new Frase("Frase-007", "Recurrente", "Polemico");
			Frase frase8 = new Frase("Frase-008", "Recurrente", "Buenas buenas");
			Frase frase9 = new Frase("Frase-009", "Recurrente", "Alguna consulta mas");


			List<Frase> frasesDeFacu = new ArrayList<>();
			frasesDeFacu.add(frase1);
			frasesDeFacu.add(frase2);

			mentor1.addFrase(frasesDeFacu);

			fraseRepository.save(frase1);
			fraseRepository.save(frase2);

			List<Frase> frasesDeGuille = List.of(frase3, frase4, frase7);
			mentor2.addFrase(frasesDeGuille);
			fraseRepository.saveAll(frasesDeGuille);

			List<Frase> frasesDeMartin = List.of(frase7,frase9);
			mentor3.addFrase(frasesDeMartin);
			fraseRepository.saveAll(frasesDeMartin);

			List<Frase> frasesDeSebas = List.of(frase8,frase1);
			mentor4.addFrase(frasesDeSebas);
			fraseRepository.saveAll(frasesDeSebas);

			List<Frase> frasesDeNico = List.of(frase5, frase6);
			mentor5.addFrase(frasesDeNico);
			fraseRepository.saveAll(frasesDeNico);



		};
	}
}