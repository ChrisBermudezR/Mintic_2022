' Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
' Es posible que el codigo generado no sea completamente correcto. Si encuentra
' errores por favor reportelos en el foro (http://pseint.sourceforge.net).

Module FASES_OBESIDAD

	Sub Main()
		Dim hijo As Double
		Dim madre As Integer
		Dim padre As Integer
		Console.WriteLine("Cuál es el peso del padre en kg: ")
		padre = Integer.Parse(Console.ReadLine())
		madre = 2*padre+4
		hijo = (madre+padre)/5
		Console.WriteLine(padre)
		Console.WriteLine(madre)
		Console.WriteLine(hijo)
		If hijo>=0 And hijo<=20 Then
			Console.WriteLine("uno")
		Else
			If hijo>=21 And hijo<=40 Then
				Console.WriteLine("dos")
			Else
				If hijo>=41 And hijo<=80 Then
					Console.WriteLine("tres")
				Else
					If hijo>80 Then
						Console.WriteLine("cuatro")
					End If
				End If
			End If
		End If
	End Sub

End Module
