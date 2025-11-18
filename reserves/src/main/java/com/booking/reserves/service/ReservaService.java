package com.booking.reserves.service;

import com.booking.reserves.model.Reserva;
import com.booking.reserves.repository.ReservaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservaService {
    
    private final ReservaRepository reservaRepository;
    
    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }
    
    public Optional<Reserva> findById(Long id) {
        return reservaRepository.findById(id);
    }
    
    public Reserva save(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    
    public Reserva update(Long id, Reserva reserva) {
        reserva.setId(id);
        return reservaRepository.save(reserva);
    }
    
    public void deleteById(Long id) {
        reservaRepository.deleteById(id);
    }
    
    public boolean existsById(Long id) {
        return reservaRepository.existsById(id);
    }
}