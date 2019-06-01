# Send Email by SMTP

# set sender information
$email = "wjdtmdrl12@gmail.com"
$password = "gokos7lovepp"


# set receiver address
$receiverA = "wjdtmdrl12@gmail.com"
$receiverB = "D17123466@mydit.ie"

$receivers = $receiverA


# set attachment
# $fileA = "/Users/jeong/Delfin99/Study/Powershell/smtp/Attachments/*.txt"
$file = Get-ChildItem -Path "/Users/jeong/Delfin99/Study/Powershell/smtp/Attachments/" -Include "*" 

$files = $file.fullname

# email structure
function SendEmail {

	Write-Host "Sending Email"

	$smtpServer = "smtp.gmail.com"

	$message = New-Object Net.Mail.MailMessage

	$smtp = New-Object Net.Mail.SmtpClient($smtpServer)

	$smtp.EnableSSL = $true

	$message.From = "$email"

	foreach($to in $receivers) {
		$message.To.Add($to)
	}

	foreach($file in $files) {
		$message.Attachments.Add($file)
	}

	$message.Subject = "Sending Email by Powershell Script"
	$message.Body = "Hi Seungki,`n`nThis is an email for test by Powershell Script`n`nThanks`nSeungki Jeong`n`n`n`n"

	$smtp.Credentials = New-Object System.Net.NetworkCredential("$email", "$password")
	
	$smtp.Send($message)
}

# execution
try {
	SendEmail
	Write-Host "Sent!"
}
catch {
	Write-Host "Error"
}
