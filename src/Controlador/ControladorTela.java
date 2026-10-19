    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Controlador;

    import Modelo.Habilidade;
    import View.Ataques;
    import View.EscolherPersonagem;
    import View.Ken.TelaKen;
    import View.Ryu.TelaRyu;
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

        public void telaAtaque(){
            Ataques ataques = new Ataques();
            jDesktop.add(ataques);
            ataques.setVisible(true);
        }
    }