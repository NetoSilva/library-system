public class emprestimoService {

    public boolean realizarEmprestimo(leitor leitor, livro livro) {
        if (leitor.multaPendente()) {
            System.out.println("Empréstimo bloqueado: leitor possui multa pendente.");
            return false;
        }

        System.out.println("Sucesso: Empréstimo realizado com sucesso!");
        return true;
    }
}