Aqui está um README básico para o sistema de cofres seguros em Java:

---

# Sistema de Cofres Seguros em Java

Este é um programa Java simples que simula a criação e abertura de dois tipos de cofres: Cofre Digital (aberto por senha) e Cofre Físico (aberto por chave).

## Descrição

Você foi contratado para desenvolver um sistema de cofres seguros com as seguintes características:

- Dois tipos de cofres: Cofre Digital e Cofre Físico.
- O Cofre Digital é aberto por senha.
- O Cofre Físico é aberto por chave.

## Funcionamento

O programa solicitará ao usuário que escolha o tipo de cofre a ser criado, digitando "digital" ou "físico". Dependendo da escolha:

- Se "digital" for escolhido, o programa solicitará a senha e a confirmação de senha do cofre digital (ambas devem conter apenas números). Após a entrada da senha, o programa verificará se a confirmação de senha corresponde à senha inserida. Se as senhas coincidirem, o cofre digital será criado com sucesso. Caso contrário, o programa informará que a senha está incorreta.
- Se "físico" for escolhido, não será necessária nenhuma outra entrada, e o cofre físico será criado diretamente.

Após a criação do cofre, o programa exibirá as informações do cofre, incluindo o tipo e o método de abertura (senha ou chave).

## Exemplos

Aqui estão alguns exemplos de entrada e suas respectivas saídas esperadas:

### Exemplo 1:

Entrada:
```
digital
12345
1234
```

Saída:
```
Tipo: Cofre Digital
Método de abertura: Senha
Senha incorreta!
```

### Exemplo 2:

Entrada:
```
fisico
```

Saída:
```
Tipo: Cofre Físico
Método de abertura: Chave
```

### Exemplo 3:

Entrada:
```
digital
2525
2525
```

Saída:
```
Tipo: Cofre Digital
Método de abertura: Senha
Cofre aberto!
```
