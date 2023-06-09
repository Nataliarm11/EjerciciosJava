package com.mindhub.EjemploClases.controllers;

import com.mindhub.EjemploClases.DTO.MentorDTO;
import com.mindhub.EjemploClases.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RequestMapping("/api")@RestController
public class MentorController {

    @Autowired
    private MentorRepository mentorRepository;

    @RequestMapping("/mentors")
    public List<MentorDTO> getMentors(){
        return mentorRepository.findAll().stream().map(mentor -> new MentorDTO(mentor)).collect(Collectors.toList());
    }


    @RequestMapping("/mentors/{id}")
    public MentorDTO getMentorDTO(@PathVariable Long id){
        return mentorRepository.findById(id).map(mentorDTO -> new MentorDTO(mentorDTO)).orElse(null);
    }



}
