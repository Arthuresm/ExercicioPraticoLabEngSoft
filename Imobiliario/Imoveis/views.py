from django.shortcuts import render
from .models import *
from django.urls import reverse
from django.contrib.auth.decorators import login_required
from django.http import HttpResponse, HttpResponseRedirect
from django.contrib.auth import authenticate, login, logout
from imoveis.forms import ProcuraBairro

# Create your views here.
def index(request):
    apartamentos = Apartamento.objects.all()
    casas = Casa.objects.all()
    list_casas = []
    list_apartamentos = []

    for imovel in apartamentos:
        list_apartamentos.append(imovel)
    for imovel in casas:
        list_casas.append(imovel)

    return render(request, 'Imoveis/index.html', {'list_apartamentos': list_apartamentos, 'list_casas': list_casas})