// Wait for the DOM to fully load
document.addEventListener('DOMContentLoaded', () => {
    const faqItems = document.querySelectorAll('.faq-item');

    faqItems.forEach(item => {
        const question = item.querySelector('.faq-question');
        const answer = item.querySelector('.faq-answer');
        const toggleIcon = item.querySelector('.toggle-icon');

        // Add click event listener to each FAQ question
        question.addEventListener('click', () => {
            // Close other FAQ items before opening the clicked one
            faqItems.forEach(otherItem => {
                if (otherItem !== item) {
                    otherItem.classList.remove('active');
                    const otherAnswer = otherItem.querySelector('.faq-answer');
                    otherAnswer.style.maxHeight = null; // Close the answer
                }
            });

            // Toggle the clicked FAQ item
            const isActive = item.classList.contains('active');
            if (isActive) {
                item.classList.remove('active');
                answer.style.maxHeight = null; // Close the answer
            } else {
                item.classList.add('active');
                answer.style.maxHeight = answer.scrollHeight + 'px'; // Open the answer
            }

            // Rotate the toggle icon
            toggleIcon.style.transform = isActive ? 'rotate(0)' : 'rotate(180deg)';
        });
    });
});
