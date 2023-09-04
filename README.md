# Gerência de chaves compostas com JPA-Hibernate
> Esse projeto é um exemplo de como gerenciar CHAVES COMPOSTAS de uma entidade do banco de dados
> mapeada com JPA.
>
> No projeto foi usado o modelo de uma LIVRARIA implementada em MySql8.
>
> No modelo utilizado a entidade Usuario possui com chave primária os campos
> CPF E EMAIL. Para gerenciar esse identificador, foi criada uma entidade auxiliar
> chamada UsuarioPK.java que é injetada na entidade principal chamada Usuario.java.
>
>No código é possivel ver as annotations usadas pela JPA/Hibernate para permitir a lógica da relação.
