package com.example.projeto;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beneficiarios")
public class BeneficiarioController {

    @Autowired
    private BeneficiarioRepository beneficiarioRepository;

    @PostMapping
    public Beneficiario cadastrarBeneficiario(@RequestBody Beneficiario beneficiario) {
        return beneficiarioRepository.save(beneficiario);
    }

    @GetMapping
    public List<Beneficiario> listarBeneficiarios() {
        return beneficiarioRepository.findAll();
    }

    @GetMapping("/{id}/documentos")
    public List<Documento> listarDocumentos(@PathVariable Long id) {
        // Implemente lógica para obter documentos de um beneficiário pelo id
        Beneficiario beneficiario = beneficiarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Beneficiário não encontrado com o ID: " + id));

        return beneficiario.getDocumentos();
    }

    @PutMapping("/{id}")
    public Beneficiario atualizarBeneficiario(@PathVariable Long id, @RequestBody Beneficiario novoBeneficiario) {
        // Implemente lógica para atualizar dados do beneficiário
        Beneficiario beneficiario = beneficiarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Beneficiário não encontrado com o ID: " + id));

        // Atualize os campos relevantes com os valores do novoBeneficiario
        beneficiario.setNome(novoBeneficiario.getNome());
        // Atualize outros campos conforme necessário

        // Salve as alterações no repositório
        return beneficiarioRepository.save(beneficiario);
    }

    @DeleteMapping("/{id}")
    public void removerBeneficiario(@PathVariable Long id) {
        beneficiarioRepository.deleteById(id);
    }
}