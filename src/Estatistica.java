class Estatistica {
    int codCidade, qntAcidentes;
    String nomeCidade;
    
    Estatistica(){
        this(0, " ", 0);
    }
        
    Estatistica(int cCidade, String nomCidade, int qAcidentes){
        codCidade = cCidade;
        nomeCidade = nomCidade;
        qntAcidentes = qAcidentes;
    }
}
