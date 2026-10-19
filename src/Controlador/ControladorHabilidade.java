    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Habilidade;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ControladorHabilidade {

    private JList<String> listaHabilidades;
    private DefaultListModel<String> modeloLista;

    public ControladorHabilidade(JList<String> listaHabilidades) {

        this.listaHabilidades = listaHabilidades;

        modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Nenhum ataque selecionado");
        listaHabilidades.setModel(modeloLista);
    }

    public void trocarHabilidade(Habilidade habilidade) {
        
        String texto = habilidade.getNome()
                + " | " + habilidade.getTipo()
                + " | Dano: " + habilidade.getDano();

        modeloLista.set(0, texto);
    }
}