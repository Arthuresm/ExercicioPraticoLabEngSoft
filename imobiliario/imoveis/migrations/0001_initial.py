# Generated by Django 2.2.7 on 2019-11-17 15:23

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Endereco',
            fields=[
                ('cep', models.CharField(max_length=8, primary_key=True, serialize=False)),
                ('pais', models.CharField(max_length=60)),
                ('estado', models.CharField(max_length=60)),
                ('bairro', models.CharField(max_length=200)),
                ('rua', models.CharField(max_length=60)),
                ('numero', models.PositiveIntegerField(null=True)),
            ],
        ),
        migrations.CreateModel(
            name='Casa',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('n_quartos', models.PositiveIntegerField()),
                ('n_suites', models.PositiveIntegerField()),
                ('n_sala_estar', models.PositiveIntegerField()),
                ('n_vaga_garagem', models.PositiveIntegerField()),
                ('area', models.FloatField()),
                ('possui_armario', models.BooleanField()),
                ('descricao', models.CharField(max_length=200)),
                ('aluguel', models.FloatField()),
                ('endereco', models.OneToOneField(null=True, on_delete=django.db.models.deletion.CASCADE, to='imoveis.Endereco')),
            ],
        ),
        migrations.CreateModel(
            name='Apartamento',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('n_quartos', models.PositiveIntegerField()),
                ('n_suites', models.PositiveIntegerField()),
                ('n_sala_estar', models.PositiveIntegerField()),
                ('n_sala_jantar', models.PositiveIntegerField()),
                ('n_vaga_garagem', models.PositiveIntegerField()),
                ('andar', models.PositiveIntegerField()),
                ('valor_condominio', models.FloatField()),
                ('area', models.FloatField()),
                ('possui_armario', models.BooleanField()),
                ('descricao', models.CharField(max_length=200)),
                ('portaria_integral', models.BooleanField()),
                ('aluguel', models.FloatField()),
                ('endereco', models.OneToOneField(null=True, on_delete=django.db.models.deletion.CASCADE, to='imoveis.Endereco')),
            ],
        ),
    ]
