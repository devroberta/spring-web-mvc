package br.com.devroberta.springwebmvc.repository;

import br.com.devroberta.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {

    List<Jedi> listJedi = new ArrayList<>();

    public JediRepository() {
        this.listJedi.add(new Jedi("Luke", "Skywalker"));
    }

    public List<Jedi> getAllJedi() {
        return this.listJedi;
    }

    public void add(Jedi jedi) {
        this.listJedi.add(jedi);
    }
}
