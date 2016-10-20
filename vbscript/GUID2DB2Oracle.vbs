' ConvertToDB2Oracle.vbs
' Cassandra Seney 2016

' Function converts a GUID to the format used in DB2 and Oracle databases for use in SQL queries

Function ConvertToDB2Oracle(strId)
      Dim strLeft, strRight, strTemp, str1, str2, str3
      strLeft = Left(strId, Len(strId) - 1)
      strRight = Right(strLeft, Len(strLeft) - 1)
      strTemp = Split(strRight, "-")
      strSectionReverse strTemp(0), str1
      strSectionReverse strTemp(1), str2
      strSectionReverse strTemp(2), str3
      ConvertToDB2Oracle = str1 + str2 + str3 + strTemp(3) + strTemp(4)
End Function

Sub strSectionReverse(str, revStr)
    Dim strTemp1, strTemp2
    
    If (Len(str) - 2 > 0) Then
        strTemp1 = Right(str, 2)
        strTemp2 = Left(str, Len(str) - 2)
        revStr = revStr + strTemp1
        strSectionReverse strTemp2, revStr
    Else
        revStr = revStr + str
    End If
      
End Sub

Dim Test
Test = ConvertToDB2Oracle("{10705454-0000-CDD2-90ED-A72C47D8F76D}")
Wscript.echo Test
