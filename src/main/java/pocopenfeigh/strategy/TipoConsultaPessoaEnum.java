package pocopenfeigh.strategy;

public enum TipoConsultaPessoaEnum {

    CONSULTA_IDPESSOA() {
        @Override
        public Pessoa buscarPessoa() {
            return null;
        }
    },
    CONSULTA_IDPESSOA_IDGARANTIA() {
        @Override
        public Pessoa buscarPessoa() {
            return null;
        }
    },
    CONSULTA_IDPESSOA_IDTIPOPESSOA_IDGARANTIA() {
        @Override
        public Pessoa buscarPessoa() {
            return null;
        }
    };

    public abstract Pessoa buscarPessoa();

}
