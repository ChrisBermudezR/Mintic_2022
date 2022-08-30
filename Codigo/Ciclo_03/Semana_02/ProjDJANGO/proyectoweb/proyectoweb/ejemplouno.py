from  django.http import HttpResponse

def mensaje(request):
    return HttpResponse("Mi primera aplicación web")