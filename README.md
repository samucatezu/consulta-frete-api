# consulta-frete-api
API REST de consulta de endereço e cálculo de frete para um determinado CEP.


## Requisitos do sistema

Para a busca do endereço do CEP, você deve consultar a API VIA CEP, conforme a
documentação https://viacep.com.br/. O valor do frete é fixo de acordo com as regiões
do Brasil: Sudeste (R$ 7,85), Centro-Oeste (R$ 12,50), Nordeste (R$ 15,98), Sul (R$
17,30) e Norte (R$ 20,83). O CEP é obrigatório e pode ser passado com ou sem máscara
na entrada e se o CEP não for encontrado uma mensagem informativa deve ser retornada
para o cliente.

## Ferramentas e tecnologias

- Java 11
- Spring boot
- API REST Template
- Documentação Swagger
- Testes unitários JUnit5
- Testes automatizados utilizando cucumber(WIP)
- Elastic Beanstalk e S3(AWS)

## Teste você mesmo!
- [Swagger na nuvem da AWS](http://consultafreteapi-env.eba-am2fq5fm.us-east-1.elasticbeanstalk.com/swagger-ui/index.html#/)

## Sobre o autor
- GitHub: [samucatezu](https://github.com/samucatezu)
- LinkedIn: [linkedin](https://www.linkedin.com/in/adrianovs87/)
- Certificações: [Credly](https://www.credly.com/users/samucatezu/badges)
- Certificações: [GCP](https://www.cloudskillsboost.google/public_profiles/44856a40-3c42-4e6d-bad1-094a43e0f97c)
