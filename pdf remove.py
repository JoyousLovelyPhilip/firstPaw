import fitz  # PyMuPDF

def remove_text_from_pdf(input_path, output_path, text_to_remove):
    doc = fitz.open(input_path)
    for page in doc:
        text_instances = page.search_for(text_to_remove)
        for inst in text_instances:
            # Cover the text with a white rectangle
            page.draw_rect(inst, color=(1, 1, 1), fill=(1, 1, 1))
    doc.save(output_path)
    doc.close()

# Correct usage with your paths
input_pdf = r"C:\Users\annet\Downloads\CCS340_CYBERSECURITY_LAB_MANUAL.pdf"
output_pdf = r"C:\Users\annet\Downloads\joy_java.pdf"
text_to_remove = "Downloaded by Magic Player (magicplayer2026@gmail.com)"

remove_text_from_pdf(input_pdf, output_pdf, text_to_remove)   
