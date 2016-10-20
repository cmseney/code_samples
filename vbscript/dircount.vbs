' dircount.vbs
' Cassandra Seney 2016

' Script to generate a recursive list of subdirectories and their file count

fsPath = "C:\test"
dirList = "c:\log.txt"

Set oFSO = CreateObject("Scripting.FileSystemObject")

Set oFSo = CreateObject("Scripting.FileSystemObject")
Set oDirList = oFSo.CreateTextFile(dirList, True)

ListFolders(fsPath)

Sub ListFolders(sPath)
  Set oFolder = oFSO.GetFolder(sPath)
  oDirList.Writeline oFolder & " " & oFolder.Files.Count 
  For Each oFldr In oFolder.SubFolders
    ListFolders oFldr.Path
  Next
End Sub
