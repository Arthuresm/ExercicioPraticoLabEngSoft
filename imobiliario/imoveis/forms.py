from django import forms
from imoveis.models import Endereco, Casa, Apartamento

class ProcuraBairro(forms.ModelForm):
    nome = forms.CharField(label='Bairro procurado', max_length=100)

