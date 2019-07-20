# SMTP 

def SendEmail():
    print('Sending Email')
    import smtplib
    fromaddr = ''
    toaddrs  = ''
    subject = 'Sending email by Python'
    text = "Hi Seungki,\n\nThis is email for test\n\nThanks,\nSeungki Jeong"
    # msg = "\r\n".join([
    #     "From: wjdtmdrl12@gmail.com",
    #     "To: wjdtmdrl12@gmail.com",
    #     "Subject: Sending email by Python",
    #     "",
    #     "Hi Seungki,",
    #     "",
    #     "This is email for test",
    #     "",
    #     "Thanks",
    #     "Seungki Jeong"
    #     ])
    msg = """From: %s\nTo: %s\nSubject: %s\n\n%s""" % (fromaddr, toaddrs, subject, text)
    username = 'wjdtmdrl12@gmail.com'
    password = 'gokos7lovepp'
    server = smtplib.SMTP('smtp.gmail.com')
    server.ehlo()
    server.starttls()
    server.login(username,password)
    server.sendmail(fromaddr, toaddrs, msg)
    server.quit()

try:
    SendEmail()
    print('Sent!')
except:
    print('Something went wrong...')