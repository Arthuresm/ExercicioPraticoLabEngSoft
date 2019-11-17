from django.db import models
from django.conf import settings
from django.core.validators import MaxValueValidator


class Endereco(models.Model):
    cep = models.PositiveIntegerField(primary_key=True, validators=[MaxValueValidator(99999999)])
    pais = models.CharField(max_length=60)
    estado = models.CharField(max_length=60)
    cidade = models.CharField(max_length=60)
    bairro = models.CharField(max_length=200)
    rua = models.CharField(max_length=60)
    numero = models.PositiveIntegerField(null=True)
    def __str__(self):
        return self.estado + ", " + self.cidade + ", " + self.bairro + ", " + self.rua + ", " + str(self.numero)


class Casa(models.Model):
    endereco = models.OneToOneField(Endereco, on_delete=models.CASCADE, null=True)
    id = models.AutoField(primary_key=True)
    n_quartos = models.PositiveIntegerField()
    n_suites = models.PositiveIntegerField()
    n_sala_estar = models.PositiveIntegerField()
    n_vaga_garagem = models.PositiveIntegerField()
    area = models.FloatField()
    possui_armario = models.BooleanField()
    descricao = models.CharField(max_length=200)
    aluguel = models.FloatField()

    def __str__(self):
        return self.endereco.__str__()

class Apartamento(models.Model):
    endereco = models.OneToOneField(Endereco, on_delete=models.CASCADE, null=True)
    id = models.AutoField(primary_key=True)
    n_quartos = models.PositiveIntegerField()
    n_suites = models.PositiveIntegerField()
    n_sala_estar = models.PositiveIntegerField()
    n_sala_jantar = models.PositiveIntegerField()
    n_vaga_garagem = models.PositiveIntegerField()
    andar = models.PositiveIntegerField()
    valor_condominio = models.FloatField()
    area = models.FloatField()
    possui_armario = models.BooleanField()
    descricao = models.CharField(max_length=200)
    portaria_integral = models.BooleanField()
    aluguel = models.FloatField()

    def __str__(self):
        return self.endereco.__str__()
