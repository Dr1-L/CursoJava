package com.loiane.cursoJava.aula36;

public class TesteContato {

  public static void main(String[] args) {

    Contato contato = new Contato();
    Endereco end = new Endereco();
    Telefone tel = new Telefone();
    Telefone tel2 = new Telefone();

    Telefone[] telefones = new Telefone[2];

    contato.setNome("Dri");
    // contato.setTelefone("51 99 999999");
    tel.setTipo("celular");
    tel.setDdd("51");
    tel.setTelefone("99999999");

    tel2.setTipo("casa");
    tel2.setDdd("51");
    tel2.setTelefone("888-8888");

    // contato.setEndereco("POA");
    end.setNomeRua("Rua Game of thrones");
    end.setNumero(18);
    end.setComplemento("-");
    end.setCidade("POA");
    end.setEstado("RS");
    end.setCep("99999-999");

    //setando os objs telefone no vetor
    telefones[0] = tel;
    telefones[1] = tel2;

    //setando os obj no contato
    contato.setEndereco(end);
    contato.setTelefones(telefones);
    // contato.setTelefone(tel);

    System.out.println(contato.getNome());
    System.out.println(contato.getEndereco().getCidade());
    //System.out.println(contato.getTelefone());

    /*if(contato != null && contato.getTelefone() != null) {
      System.out.println(contato.getTelefone().getDdd()+ contato.getTelefone().getTelefone());
    }*/
    if (contato != null && contato.getTelefones() != null) {
      for (Telefone t : contato.getTelefones()) {
        System.out.println(t.getDdd() + " - " + t.getTelefone());
      }
    }
    //boa pratica verificar se o obj esta vazio
    if (contato != null && contato.getEndereco() != null) {
      System.out.println(contato.getEndereco().getCidade());
    }
  }
}
