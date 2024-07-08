package com.TDSpring.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/joueurs")
public class JoueurResource {

    private List<Joueur> joueurs = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Joueur>> getJoueurs() {
        return ResponseEntity.ok(joueurs);
    }

    @PostMapping("/add")
    public ResponseEntity<Joueur> addJoueur(@RequestBody Joueur joueur) {
        joueurs.add(joueur);
        return ResponseEntity.status(201).body(joueur);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Joueur> updateJoueur(@PathVariable("id") int id, @RequestBody Joueur joueur) {
        for (Joueur j : joueurs) {
            if (j.id == id) {
                j.pseudo = joueur.pseudo;
                j.genre = joueur.genre;
                j.niveau = joueur.niveau;
                j.pouvoir = joueur.pouvoir;
                j.sante = joueur.sante;
                return ResponseEntity.ok(j);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJoueur(@PathVariable("id") int id) {
        joueurs.removeIf(joueur -> joueur.id == id);
        return ResponseEntity.noContent().build();
    }
}