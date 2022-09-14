from http.client import HTTPResponse
from django.http import HttpResponse

def saludar(request, nombre, hora):
    return HttpResponse(f'Buenas Noches {nombre} {hora}')