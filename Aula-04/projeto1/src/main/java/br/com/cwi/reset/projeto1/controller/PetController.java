package br.com.cwi.reset.projeto1.controller;

import br.com.cwi.reset.projeto1.domain.Pet;
import br.com.cwi.reset.projeto1.exception.PetNaoExistenteException;
import br.com.cwi.reset.projeto1.service.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    private PetService service = new PetService();

//    private static List<Pet> pets = new ArrayList<>();


    @GetMapping
    public List<Pet> getPet() {
        return service.listarPets();
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Pet> getByNome(@PathVariable String nome) throws PetNaoExistenteException {
        return ResponseEntity.ok(service.buscarPetPeloNome(nome));
    }
    @PostMapping
    public Pet cadastrarPet(@RequestBody String nome) throws PetNaoExistenteException {
        return service.buscarPetPeloNome(nome);
    }

    @PutMapping
    public Pet atualizarPet(@RequestBody Pet pet) throws PetNaoExistenteException {
        return service.atualizarPet(pet);
    }

    @DeleteMapping("/{nome}")
    public void deletarPet(@PathVariable String nome) throws PetNaoExistenteException {
        service.deletarPet(nome);
    }
}
