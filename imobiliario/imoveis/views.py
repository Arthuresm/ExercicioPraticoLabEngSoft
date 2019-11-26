from django.shortcuts import render, get_object_or_404
from .models import *
from django.urls import reverse
from django.contrib.auth.decorators import login_required
from django.http import HttpResponse, HttpResponseRedirect
from django.contrib.auth import authenticate, login, logout
# from imoveis.forms import ProcuraBairro

# Create your views here.
def index(request):
    apartamentos = Apartamento.objects.all()
    casas = Casa.objects.all()
    list_casas = []
    list_apartamentos = []


    for imovel in apartamentos:
        imovel.aluguel = "R$" + str(imovel.aluguel)
        list_apartamentos.append(imovel)
    for imovel in casas:
        imovel.aluguel = "R$" + str(imovel.aluguel)
        list_casas.append(imovel)

    return render(request, 'imoveis/index.html', {'list_apartamentos': list_apartamentos, 'list_casas': list_casas})

def cep_id(request, cep):
    enderecos = get_object_or_404(Endereco, cep=cep)
    apartamentos = Apartamento.objects.filter(endereco=enderecos)
    casas = Casa.objects.filter(endereco=enderecos)

    list_casas = []
    list_apartamentos = []

    for imovel in apartamentos:
        imovel.aluguel = "R$" + str(imovel.aluguel)
        list_apartamentos.append(imovel)
    for imovel in casas:
        imovel.aluguel = "R$" + str(imovel.aluguel)
        list_casas.append(imovel)

    consulta = enderecos.cep

    return render(request, 'imoveis/cep_id.html', {'consulta': consulta, 'list_apartamentos': list_apartamentos, 'list_casas': list_casas})


def bairro_id(request, nome_bairro):
    # enderecos = get_object_or_404(Endereco, bairro=nome_bairro)
    enderecos = Endereco.objects.filter(bairro__icontains=nome_bairro)
    apartamentos = Apartamento.objects.filter(endereco=enderecos)
    casas = Casa.objects.filter(endereco=enderecos)
    consulta=nome_bairro
    list_casas = []
    list_apartamentos = []

    for endereco in enderecos:
        consulta = endereco.bairro
        apartamentos = Apartamento.objects.filter(endereco=endereco)
        casas = Casa.objects.filter(endereco=endereco)
        for imovel in apartamentos:
            imovel.aluguel = "R$" + str(imovel.aluguel)
            list_apartamentos.append(imovel)
        for imovel in casas:
            imovel.aluguel = "R$" + str(imovel.aluguel)
            list_casas.append(imovel)

    return render(request, 'imoveis/bairro.html', {'consulta': consulta, 'list_apartamentos': list_apartamentos, 'list_casas': list_casas})


def bairros_disponiveis(request):
    enderecos = Endereco.objects.all()
    list_bairro = []

    for endereco in enderecos:
        aux = endereco.bairro    
        result = aux in list_bairro
        if(result == False):
            list_bairro.append(aux)

    return render(request, 'imoveis/bairros_disponiveis.html', {'list_bairro': list_bairro})

def apartamento_id(request, apartamento_id):

    apartamento = get_object_or_404(Apartamento, pk=apartamento_id)
    apartamento.aluguel = "R$" + str(apartamento.aluguel)
    apartamento.valor_condominio = "R$" + str(apartamento.valor_condominio)
    return render(request, 'imoveis/view_apartamento.html', {'apartamento': apartamento})

def casa_id(request, casa_id):

    casa = get_object_or_404(Casa, pk=casa_id)
    casa.aluguel = "R$" + str(casa.aluguel)
    return render(request, 'imoveis/view_casa.html', {'casa': casa})

