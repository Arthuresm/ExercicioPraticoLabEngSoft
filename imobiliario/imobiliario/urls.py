"""imobiliario URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/2.2/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path, re_path
from imoveis import views
from django.conf.urls.static import static

app_name = 'imoveis'

urlpatterns = [
    path('admin/', admin.site.urls, name='admin'),
    path('', views.index, name='index'),
    path('busca/<int:cep>', views.cep_id, name='cep_id'),
    path('busca/bairro/<slug:nome_bairro>', views.bairro_id, name='bairro_id'),
    path('bairro', views.bairros_disponiveis, name='bairro_disponiveis'),
    path('apartamento/<int:apartamento_id>', views.apartamento_id, name='apartamento_id'),
    path('casa/<int:casa_id>', views.casa_id, name='casa_id'),

]
