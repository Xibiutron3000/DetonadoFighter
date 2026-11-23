    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Controlador;

    import View.Ataques;
import View.Blanka.TelaBlanka;
import View.Chunli.TelaChunli;
import View.Dhalsim.TelaDhalsim;
    import View.EscolherPersonagem;
import View.Guile.TelaGuile;
import View.Honda.TelaHonda;
import View.JanelaJuggle;
    import View.Ken.TelaKen;
    import View.Ryu.TelaRyu;
import View.TelaConceitos;
import View.Zangief.TelaZangief;
    import java.awt.Dimension;
    import javax.swing.DefaultListModel;
    import javax.swing.JDesktopPane;
    import javax.swing.JList;

    /**
     *
     * @author Discentes
     */
    public class ControladorTela {
        JDesktopPane jDesktop;
        private JList<String> listaHabilidades;
        private DefaultListModel<String> modeloLista;
        
        
        
        public void telaPersonagem(){
            jDesktop.removeAll();
            jDesktop.updateUI();
            Dimension resolucao = jDesktop.getSize();
            EscolherPersonagem telaP = new EscolherPersonagem(jDesktop);
            telaP.setSize(resolucao);
            telaP.setLocation(0,0);
            jDesktop.add(telaP);
            telaP.setVisible(true);
        }

        public ControladorTela(JDesktopPane jDesktop) {
            this.jDesktop = jDesktop;
        }
        
        
            public void telaRyu(){
            jDesktop.removeAll();
            jDesktop.updateUI();
            Dimension resolucao = jDesktop.getSize();
            TelaRyu telaP = new TelaRyu(jDesktop);
            telaP.setSize(resolucao);
            telaP.setLocation(0,0);
            jDesktop.add(telaP);
            telaP.setVisible(true);
        }

        public void telaKen(){
            jDesktop.removeAll();
            jDesktop.updateUI();
            Dimension resolucao = jDesktop.getSize();
            TelaKen telaP = new TelaKen(jDesktop);
            telaP.setSize(resolucao);
            telaP.setLocation(0,0);
            jDesktop.add(telaP);
            telaP.setVisible(true);
        }
        public void telaChunli(){
            jDesktop.removeAll();
            jDesktop.updateUI();
            Dimension resolucao = jDesktop.getSize();
            TelaChunli telaP = new TelaChunli(jDesktop);
            telaP.setSize(resolucao);
            telaP.setLocation(0,0);
            jDesktop.add(telaP);
            telaP.setVisible(true);
        }
        public void telaHonda(){
            jDesktop.removeAll();
            jDesktop.updateUI();
            Dimension resolucao = jDesktop.getSize();
            TelaHonda telaP = new TelaHonda(jDesktop);
            telaP.setSize(resolucao);
            telaP.setLocation(0,0);
            jDesktop.add(telaP);
            telaP.setVisible(true);
        }
        
        public void telaConceitos(){
            jDesktop.removeAll();
            jDesktop.updateUI();
            Dimension resolucao = jDesktop.getSize();
            TelaConceitos telaP = new TelaConceitos(jDesktop);
            telaP.setSize(resolucao);
            telaP.setLocation(0,0);
            jDesktop.add(telaP);
            telaP.setVisible(true);
        }
        public void telaGuile(){
            jDesktop.removeAll();
            jDesktop.updateUI();
            Dimension resolucao = jDesktop.getSize();
            TelaGuile telaP = new TelaGuile(jDesktop);
            telaP.setSize(resolucao);
            telaP.setLocation(0,0);
            jDesktop.add(telaP);
            telaP.setVisible(true);
        }
        public void telaDhalsim(){
            jDesktop.removeAll();
            jDesktop.updateUI();
            Dimension resolucao = jDesktop.getSize();
            TelaDhalsim telaP = new TelaDhalsim(jDesktop);
            telaP.setSize(resolucao);
            telaP.setLocation(0,0);
            jDesktop.add(telaP);
            telaP.setVisible(true);
        }
        
        public void telaBlanka(){
            jDesktop.removeAll();
            jDesktop.updateUI();
            Dimension resolucao = jDesktop.getSize();
            TelaBlanka telaP = new TelaBlanka(jDesktop);
            telaP.setSize(resolucao);
            telaP.setLocation(0,0);
            jDesktop.add(telaP);
            telaP.setVisible(true);
        }
        
        public void telaZangief(){
            jDesktop.removeAll();
            jDesktop.updateUI();
            Dimension resolucao = jDesktop.getSize();
            TelaZangief telaP = new TelaZangief(jDesktop);
            telaP.setSize(resolucao);
            telaP.setLocation(0,0);
            jDesktop.add(telaP);
            telaP.setVisible(true);
        }

        public void telaAtaque(){
            Ataques ataques = new Ataques();
            jDesktop.add(ataques);
            ataques.setVisible(true);
        }
        
    }