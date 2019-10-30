from django.db import models
from django.conf import settings

class Endereco(models.Model):
    cep = models.CharField(primary_key=True, max_length=8)
    pais = models.CharField(max_length=60) 
    estado = models.CharField(max_length=60)
    bairro = models.CharField(max_length=200)
    rua = models.CharField(max_length=60)
    numero = models.PositiveIntegerField(null=True)
    def __str__(self):
        return self.cep


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

    def __str__(self):
        return str(self.id)

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

    def __str__(self):
        return str(self.id)
