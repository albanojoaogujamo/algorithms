totalAlunos = int(input("Quantos alunos tem a turma? "))
alunosAvaliados = 0

while alunosAvaliados < totalAlunos:

  nomeAluno = input("Introduz o nome do aluno: ")
  nota1 = float(input(" Introduz a nota 1: "))
  nota2 = float(input("Introduz a nota 2: "))
  nota3 = float(input("Introduz a nota 3: "))

  soma = nota1 + nota2 + nota3
  mediaFinal = soma / 3

  if mediaFinal >= 13.5:
        situacao = "Dispensado"
  elif mediaFinal >= 9.5:
        situacao = "Aprovado ao Exame"
  else:
        situacao = "Excluido"

  print(nomeAluno, "-", situacao, "- Média:", mediaFinal)

  alunosAvaliados = alunosAvaliados + 1