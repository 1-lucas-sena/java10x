package Intremediario.Aula26a29;

public record NinjaRecord(String nome, String email, int telefone) {

    public String emailCaixaAlta() {
        return email.toUpperCase();
    }
}
