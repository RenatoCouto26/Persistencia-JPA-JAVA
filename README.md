# Gerência de chaves compostas com JPA-Hibernate
> Esse projeto é um exemplo de como gerenciar CHAVES COMPOSTAS de uma entidade do banco de dados
> mapeada com JPA.
>
> No projeto foi usado o modelo de uma LIVRARIA implementada em MySql8.
>
> No modelo, utilizado a entidade Usuario.java possui como chave primária os campos
> CPF E EMAIL. Para gerenciar esse identificador, foi criada uma entidade auxiliar
> chamada UsuarioPK.java que é injetada na entidade principal chamada Usuario.java,
> mensionada anteriomente.
>
> No projeto também é possível observar outro ponto que gera bastante dúvida no
> ORM(mapeamento objeto-relacinal), que é a geração automática da tabela de intersecção
>no relacionamento MANY-TO-MANY.
>No código é possivel ver as annotations usadas pela JPA/Hibernate para permitir a lógica da relação.
