from django.contrib import admin
from .models import Casa, Apartamento, Endereco

# Register your models here.
admin.site.register(Casa)
admin.site.register(Apartamento)
admin.site.register(Endereco)