package br.com.login.component;

import br.com.login.swing.Botao;
import br.com.login.swing.CampoSenha;
import br.com.login.swing.CampoTexto;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Luan Tomiozzo
 */
public class PanelLoginRegister extends javax.swing.JLayeredPane {

    public PanelLoginRegister() {
        initComponents();
        initRegister();
        initLogin();
        login.setVisible(false);
        register.setVisible(true);
    }

    private void initRegister() {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Cadastrar");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(22, 116, 66));
        register.add(label);

        CampoTexto txtUser = new CampoTexto();
        txtUser.setHint("Nome");
        txtUser.setPrefixIcon(new ImageIcon("user.png"));
        register.add(txtUser, "w 60%");

        CampoTexto txtEmail = new CampoTexto();
        txtEmail.setHint("Email");
        txtEmail.setPrefixIcon(new ImageIcon("mail.png"));
        register.add(txtEmail, "w 60%");

        CampoSenha txtPass = new CampoSenha();
        txtPass.setHint("Senha");
        txtPass.setPrefixIcon(new ImageIcon("pass.png"));
        register.add(txtPass, "w 60%");

        Botao cmd = new Botao();
        cmd.setBackground(new Color(7, 164, 121));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("INSCREVER-SE");
        register.add(cmd, "w 40%, h 40");
    }

    private void initLogin() {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Entrar");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(22, 116, 66));
        login.add(label);

        CampoTexto txtUser = new CampoTexto();
        txtUser.setHint("Usuario");
        txtUser.setPrefixIcon(new ImageIcon("user.png"));
        login.add(txtUser, "w 60%");

        CampoSenha txtPass = new CampoSenha();
        txtPass.setHint("Senha");
        txtPass.setPrefixIcon(new ImageIcon("pass.png"));
        login.add(txtPass, "w 60%");

        JButton cmdForget = new JButton("Esqueceu a senha?");
        cmdForget.setForeground(new Color(100, 100, 100));
        cmdForget.setFont(new Font("sansserif", 1, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdForget);

        Botao cmd = new Botao();
        cmd.setBackground(new Color(7, 164, 121));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("ENTRAR");
        login.add(cmd, "w 40%, h 40");
    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
