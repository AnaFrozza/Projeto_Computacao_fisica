package Main;

import java.util.ArrayList;
import java.util.List;

public class DAONotas extends DAOGenerico<Notas> {

    public DAONotas() {
        super(Notas.class);
    }

    public List<Notas> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Notas e WHERE e.nomeNotas LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }

    public List<Notas> listById(int id) {
        return em.createQuery("SELECT e FROM Notas e WHERE e.idNotas = :id").setParameter("id", id).getResultList();
    }

    public List<Notas> listInOrderNome() {
        return em.createQuery("SELECT e FROM Notas e ORDER BY e.nomeNotas").getResultList();
    }

    public List<String> listInOrderNomeStrings() {
        List<Notas> lf = listInOrderNome();
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
//            ls.add(lf.get(i).getIdNotas() + "-" + lf.get(i).getNomeNotas());
        }
        return ls;
    }
}
